function Person(gender) {
	this.gender = gender || 'Mele';
}
function Parent(name) {
	this.name = name || 'Bartek';
}
Parent.prototype.sayHello = function () {
	console.log(this.name);
};
function Child(name) {}


// Child prototype is Parent
Child.prototype = new Parent("Mirek");

// Only constructor inheritance
// defect : copies only properties added to 'this'
function Child(name) {
	Person.apply(this, arguments);
	Parent.apply(this, arguments);
}

// Default inheritance
// defect : double Parent constructor (name inherited two times)
function Child(name) {
	Parent.apply(this, arguments);
}
Child.prototype = new Parent();

// Sharing prototype
Child.prototype = Parent.prototype;

// Temporary constructor
var inherit = (function () {
	const F = function () {};
	return function (C, P) {
		F.prototype = P.prototype;
		C.prototype = new F();
		C.uber = P.prototype;
		C.prototype.constructor = C;
	} 
})();

// Literal object prototype inheritance - ECMA 5 Object.create(parent)
var parent = {
	name : 'Marcin'
}
var objectAsPrototype = (function () {
	var F = function () {};
	return function (o) {
		F.prototype = o;
		return new F();
	}
})();

// mixin, extends, assign - in prod code it should be deep copying
var mixin = function (p, c) {
	var i;
	c = c || {};
	for (i in p) {
		if (p.hasOwnProperty(i)) {
			c[i] = p[i];
		}
	}
	return c;
};


