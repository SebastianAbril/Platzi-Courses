import _ from 'lodash';

const data = [
  {
    username: 'nico',
    role: 'admin',
  },
  {
    username: 'Ana',
    role: 'seller',
  },
  {
    username: 'Veronica',
    role: 'seller',
  },
  {
    username: 'Juan',
    role: 'customer',
  },
];

const rta = _.groupBy(data, (item) => item.role);
console.log(rta);

const pepe = 1 + '1';
console.log(typeof pepe);
