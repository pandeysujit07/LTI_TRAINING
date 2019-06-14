import{ Component} from '@angular/core';
@Component({
            selector: 'list-product',
            templateUrl: './list-product.component.html',
            //styleUrls: ['./list-product.component.css']

})


export class ListProductComponent{
    products: Product[]; // this is a array of product

    display(){

        this.products=[
                        new Product(1,"Nokia 660", 5999,99),
                        new Product(2,"Sony pixel ", 15999,99),
                        new Product(3,"Samsung note ",35999,99),
                        new Product(4,"iphone x", 45999,99),
                        new Product(5,"MI 9", 75999,99)
                     ]
    }


}

export class Product{
        id: number;
        name:string;
        price: number;
        quantity:number;


     constructor(id: number, name: string, price: number,quantity:number){
            this.id=id;
             this.name=name;
             this.price=price;
             this.quantity=quantity;


        }
}