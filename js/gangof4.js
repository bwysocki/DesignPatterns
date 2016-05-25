// singleton as literal
var x = {};
var y = {};
console.log(x !== y);
console.log(x != y);

var Singleton = (function () {
	var instance;
	return function () {
		if (instance) {
			return instance;
		}
		instance = this;
		this.singleton = true;
	}
})();

var a = new Singleton();
var b = new Singleton();
console.log(a === b);

//factory
var factory = (function() {
	return {
		getInstance: function (type) {
			if (type === 'A') {
				return new A();
			} else if (type === 'B') {
				return new B();
			} else if (type === 'C') {
				return new C();
			} 
		}
	}
})();
function A(){}
function B(){}
function C(){}

//iterator
var iterator = (function (){
	
	var collection = [1,2,3,4,5],
		index = 0,
		len = collection.length;
	
	return {
		hasNext: function () {
			return index < len;
		},
		next: function () {
			if (!this.hasNext()) {
				return null;
			}
			index++;
			return collection[index-1];
		}
	};
	
})();
while (iterator.hasNext()) {
	console.log(iterator.next());
}

//decorator
function Sale(price) {
	this.price = price || 100;
	this.decorators = []
}
Sale.prototype.decorate = function(decorator) {
	this.decorators.push(decorator);
}
Sale.prototype.getPrice = function () {
	var price = this.price,
		i, name;
	for (i = 0; i < this.decorators.length; i++) {
		name = this.decorators[i];
		price = Sale.decorators[name].getPrice(price);
	}
	return price;
}

Sale.decorators = {};
Sale.decorators.withTax = {
	getPrice: function(price) {
		return price + price * 5/100;
	}
}
Sale.decorators.withDiscount = {
	getPrice: function(price) {
		return price - 12;
	}
}

var sale = new Sale(100);
sale.decorate('withTax');
sale.decorate('withDiscount');
console.log(sale.getPrice());

//strategy - validation based on config

//facade 
var eventFacade = {
	stop: function(e) {
		e.preventDefault();
		e.stopPropagation();s
	}
}

//proxy
function RealOb() {
	this.getSth = function(type) {
		console.log('Time consuming operation');
		if (type === 'A') {
			return 'A';
		} else if (type === 'B') {
			return 'B';
		}
	}
}

function ProxyOb() {
	var cache = {},
		realOb = new RealOb();
	return {
		getSth : function(type) {
			if (cache[type]) {
				return cache[type];
			}
			var r = realOb.getSth(type);
			cache[type] = r;
			return r;
		}
	}
}
var proxy = ProxyOb();
proxy.getSth('A');
proxy.getSth('A');

//observer

