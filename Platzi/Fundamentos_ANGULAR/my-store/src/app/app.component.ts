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

}
// LOS ATRIBUTOS TIENEN QUE SER PUBLICOS, TS POR DEFECTO LOS PONE PUBLICOS
