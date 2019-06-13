var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    Person.prototype.info = function () {
        return "Hello " + this.name + " Your age is " + this.age;
    };
    return Person;
}());
var p1 = new Person("Sujit", 23);
console.log(p1.info());
