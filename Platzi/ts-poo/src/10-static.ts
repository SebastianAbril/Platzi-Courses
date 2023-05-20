console.log('Math.PI', Math.PI);
console.log('Math.max', Math.max(1, 2, 34, 5, 6, 7));

class MyMath {
  static readonly PI = 3.14;
  static max(...numbers: number[]) {
    return numbers.reduce((max, item) => (max >= item ? max : item));
  }
}

console.log('MyMath.PI', MyMath.PI);
console.log('MyMath.max', MyMath.max(122, 3, 4, 111, 3));
const numbers = [122, 3, 4, 111, 3, 9, 3333];
console.log('MyMath.max', MyMath.max(...numbers));
console.log('*********************************');
console.log('MyMath.max', MyMath.max(-1, -9, -8));
