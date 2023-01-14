import { Component } from '@angular/core';

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
}
// LOS ATRIBUTOS TIENEN QUE SER PUBLICOS, TS POR DEFECTO LOS PONE PUBLICOS
