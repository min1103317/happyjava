const prettyPrint = {
    calculate: {
        
        add(a,b) {
            let result = a+b;    
            console.log("%d + %d = %d",a,b,result);
        },

        sub(a,b) {
            let result = a-b;
            console.log("%d - %d = %d",a,b,result);
        },

        mul(a,b) {
            let result = a*b;
            console.log("%d * %d = %d",a,b,result);
        },

        div(a,b) {
            let result = a/b;
            console.log("%d / %d = %d",a,b,result);
        }
    }
};

prettyPrint.calculate.add(10,5);
prettyPrint.calculate.sub(10,5);
prettyPrint.calculate.mul(10,5);
prettyPrint.calculate.div(10,5);