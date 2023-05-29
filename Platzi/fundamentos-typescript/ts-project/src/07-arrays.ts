(() => {
  let prices = [1, 2, 3, 4, 5, , 'hola', true];
  prices.push(3);

  let products = ['hola', true];
  let mixed: (number | string | boolean)[] = ['hola', true];
  mixed.push(12);
  mixed.push('pepe');
  mixed.push(true);

  let numbers = [1,2,3,4,5,6];
  numbers.map(item => item*2);
})();
