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
}
// LOS ATRIBUTOS TIENEN QUE SER PUBLICOS, TS POR DEFECTO LOS PONE PUBLICOS
