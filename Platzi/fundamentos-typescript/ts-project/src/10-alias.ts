(() => {
  type UserID = string | number;
  let userId: UserID;

  function greeting(userId: UserID, size: Sizes) {
    if (typeof userId === 'string') {
      console.log(`string ${userId.toLocaleLowerCase()}`);
    }
  }

  // Literal types
  type Sizes = 'S' | 'M' | 'L' | 'XL';
  let shirtSize: Sizes;
  shirtSize = 'M';
  shirtSize = 'L';
  shirtSize = 'XL';
  shirtSize = 'S';

  greeting(113, 'S');
})();
