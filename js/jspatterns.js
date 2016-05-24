/*

1. Single var declaration.

2. Minimalize global variables.

3. The for-in loop only for objects (not arrays). No order guarancee.

4. No eval, no == comparison. 

*/

// block possibility to call as function (without new)
function UseOnlyWithConstructor() {
	if (!(this instanceof UseOnlyWithConstructor)) {
		return new UseOnlyWithConstructor(arguments);
	}
	this.ok = ':)';
}
var tmp = UseOnlyWithConstructor();

//currying
function add(x, y) {
	if (y === undefined) {
		return function (y) {
			return x + y;
		}
	}
	return x + y;
}
var add2000 = add(2000);

//namespace pattern
var MyApp = {};
MyApp.x = '...';

//module pattern = namespace + closures, private
MyApp.mymodule = (function(){
	var someOtherModule = MyApp.otherModule, // dependencies
		myPrivate = 5, myPrivFn = function() {}; //private variables
		
		return {
			//public interface
		}
	
})();

//sandbox
new Sandbox(['a', 'b'], function (box) {
	
});
Sandbox.modules.a = function (box) {}; // module a

//borrowing methods
function A() {
	this.name = 'A';
}
A.prototype.sayHello = function (){
	console.log(this.name);
}
var x = {
	name : 'x',
	borrowedSayHello : function () {
		A.prototype.sayHello.apply(this);
	}
}
x.borrowedSayHello();
