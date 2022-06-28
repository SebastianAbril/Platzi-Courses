natalia = {
    name: "Natalia",
    age: 30,
    cursosAprobados: [
        "Curso Definitivo de HTML y CSS",
        "Curso Práctico de HTML y CSS",
    ],
    aprobarCurso(nuevoCursito){
        this.cursosAprobados.push(nuevoCursito)
    }
};

// Hacer que Natalia apruebe otro curso
natalia.cursosAprobados.push("Curso de Responsive Design")

function Student(name, age, cursosAprobados){
    this.name = name;
    this.age = age;
    this.cursosArobados = cursosAprobados;
    /* this.aprobarCurso = function (nuevoCursito){
        this.cursosAprobados.push(nuevoCursito);
    } */
}
Student.prototype.aprobarCurso = function (nuevoCursito){
    this.cursosAprobados.push(nuevoCursito);
}

const juanita = new Student("Juanita Alejandra",15,["Curso de INtroducción a la Producción de Videojuegos", "Curso de Creación de Personajes"]);

console.log(juanita.aprobarCurso("Hola Pepe"));