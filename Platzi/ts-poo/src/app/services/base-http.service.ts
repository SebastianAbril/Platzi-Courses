import axios from 'axios';

import { Category } from './../models/category.model';
import { Product } from '../models/product.model';

export class BaseHttpService<TypeClass> {
  //data: TypeClass[] = [];

  constructor(private url: string) {}
  async getAll() {
    const { data } = await axios.get<TypeClass[]>(this.url);
    return data;
  }
}

/* const service = new BaseHttpService<string>();
service.getAll();

const service1 = new BaseHttpService<number>();
service1.getAll; */

(async () => {
  const url1 = 'https://api.escuelajs.co/api/v1/products';
  const productsService = new BaseHttpService<Product>(url1);

  const rta = productsService.getAll();
  console.log(rta);

  const url2 = 'https://api.escuelajs.co/api/v1/categories';
  const categoryService = new BaseHttpService<Category>(url2);

  const rta1 = await categoryService.getAll();
  console.log(rta1);
})();
