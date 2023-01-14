import { Component } from '@angular/core';
import { Product } from './product.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-store';
  name = 'Sebastian'
  lastName = 'Abril'
  age = 30;
  foto = 'https://source.unsplash.com/random'
  buttonDisabled = true;
  person = {
    name: 'Sebastian',
    age: 30,
    avatar: 'https://source.unsplash.com/random'
  }

  names: string[]  = ['Nico','Juli','Santi'];
  newName = '';

  pets: string[] = ['Sasha','Cleo','Hell']
  newPet = '';


  toggleButton(){
    this.buttonDisabled = false;
  }

  increaseAge(){
    this.person.age += 1;
  }

  onScroll(event: Event){
    const element = event.target as HTMLElement;
    console.log(element.scrollTop);
  }

  changeName(event: Event){
  const element = event.target as HTMLInputElement;
  this.person.name = element.value;
  }

  addName(){
    this.names.push(this.newName);
    this.newName = '';
  }

  deleteName(index: number){
    this.names.splice(index, 1);
  }

  addPet(){
    this.pets.push(this.newPet);
  }

  deletePet(index: number){
    this.pets.splice(index, 1);
  }

  products: Product[] = [
    {
      name: 'EL mejor juguete',
      price: 565,
      image: 'https://raw.githubusercontent.com/platzi/angular-fundamentals/10-step/src/assets/images/toy.jpg',
      category: 'all'
    },
    {
      name: 'Bicicleta casi nueva',
      price: 356,
      image: 'https://raw.githubusercontent.com/platzi/angular-fundamentals/10-step/src/assets/images/bike.jpg'
    },
    {
      name: 'Colleción de albumnes',
      price: 34,
      image: 'https://raw.githubusercontent.com/platzi/angular-fundamentals/10-step/src/assets/images/album.jpg'
    },
    {
      name: 'Mis libros',
      price: 23,
      image: 'https://raw.githubusercontent.com/platzi/angular-fundamentals/10-step/src/assets/images/books.jpg'
    },
    {
      name: 'Casa para perro',
      price: 34,
      image: 'https://raw.githubusercontent.com/platzi/angular-fundamentals/10-step/src/assets/images/house.jpg'
    },
    {
      name: 'Gafas',
      price: 3434,
      image: 'https://raw.githubusercontent.com/platzi/angular-fundamentals/10-step/src/assets/images/glasses.jpg'
    }
  ]
}
// LOS ATRIBUTOS TIENEN QUE SER PUBLICOS, TS POR DEFECTO LOS PONE PUBLICOS
