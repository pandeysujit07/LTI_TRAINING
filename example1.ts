export class Person{
    name: String;
    age: number;

    constructor(name: string , age: number){
        this.name=name;
        this.age=age;

    }
    info():string{
        return "Hello "+this.name + " Your age is "+this.age ;
      
    }

}


let p1: Person= new Person("Sujit",23);
console.log(p1.info());