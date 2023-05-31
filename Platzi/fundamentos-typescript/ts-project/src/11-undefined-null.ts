(() => {
  //let myNumber: number = undefined;
  //let myString: string = null;
  let myNull = null;
  let myUndefined = undefined;

  /* Para null y undefined el tipo inferido es any */
  let myNull2: null = null;
  let myUndefined2: undefined = undefined;

  let myNumber: number | null = null;
  myNumber = 12;

  let myString: string | undefined = undefined;
  myString = 'assa';

  function hi(name: string | null) {
    let hello = 'Hola ';
    if (name) {
      hello += name.toLocaleLowerCase();
    } else {
      hello += 'nodoy';
    }
    console.log(hello);
  }

  hi('Sebastian');
  hi(null);

  function hiV2(name: string | null) {
    let hello = 'Hola ';
    hello += name?.toLowerCase() || 'nobodoy';
    console.log(hello);
  }

  hiV2('SebastiannnnnXXx');
  hiV2(null);
})();
