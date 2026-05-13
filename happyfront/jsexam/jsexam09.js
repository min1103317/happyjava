this.name = '사람';

const obj = {
    name : '겍체',

     normalFunc: function() {
        console.log(this.name);
    },

     arrowFunc: () => {
        console.log(this.name);
    }
};

obj.normalFunc();
obj.arrowFunc();