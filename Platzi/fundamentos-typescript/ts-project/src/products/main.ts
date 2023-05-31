import { calcStock, addProduct, products } from './product.service';

addProduct({
  title: 'Pro1',
  createdAt: new Date(1991, 1, 1),
  stock: 5,
  size: 'S',
});

addProduct({
  title: 'Pro1',
  createdAt: new Date(1991, 1, 1),
  stock: 6,
  size: 'XL',
});

console.log(products);
const total = calcStock();
console.log(total);
