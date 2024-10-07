export const proto = {
  sender: 'luis@gmail.com',
};

// Prototype Object
export const transaction = {
  sender: 'luis@joj.com',
  recipient: 'luke@joj.com',
};

// create con dos parametros, objeto de PropertyDescriptor
const moneyTransaction = Object.create(transaction, {
  funds: {
    value: 0.0,
    enumerable: true,
    writable: true,
    configurable: false,
  },
});
