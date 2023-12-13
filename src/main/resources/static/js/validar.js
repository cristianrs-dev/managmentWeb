$("#validaForms").validate();

$("#validaForms").validate({
    rules: {
        nome: {
            required: true
    },   
    matricula: {
        required: true
},        
        salario: {
            required: true,
          /*  email: true*/
        },
        documento: {
            required: true,
          /*  email: true*/
        },
        cargo: {
            required: true,
          /*  email: true*/
        },
        login: {
            required: true,
            minlength: 6,
            maxlength: 12
        },
        senha: {
            required: true,
            minlength: 6,
            maxlength: 12
        },
        matricula: {
            required: true,
           /* minlength: 6,
            maxlength: 12*/
        },
        contato: {
            required: true,
           /* minlength: 6,
            maxlength: 12*/
        },
        modelo: {
            required: true,
           /* minlength: 6,
            maxlength: 12*/
        },
        placa: {
            required: true,
           /* minlength: 6,
            maxlength: 12*/
        },
        cor: {
            required: true,
           /* minlength: 6,
            maxlength: 12*/
        }

    },
    messages: {
        nome: {
            required: "campo nome é obrigatório",
        },
        salario: {
            required: "campo salario é obrigatório",
           /* email: "O e-mail deve estar no formato: xxx@xxxx.xxx"*/
        },
        documento: {
            required: "campo documento é obrigatório",
           /* email: "O e-mail deve estar no formato: xxx@xxxx.xxx"*/
        },
        cargo: {
            required: "campo cargo é obrigatório",
           /* email: "O e-mail deve estar no formato: xxx@xxxx.xxx"*/
        },
        senha: {
            required: "campo senha é obrigatório",
            minlength: "A senha deve ter ao menos 6 caracteres",
            maxlength: "A senha deve ter no máximo 12 caracteres",
        },   
        login: {
            required: "campo login é obrigatório",
            minlength: "A senha deve ter ao menos 6 caracteres",
            maxlength: "A senha deve ter no máximo 12 caracteres",
        }, 
        modelo: {
            required: "campo modelo é obrigatório",
            minlength: "A senha deve ter ao menos 6 caracteres",
            maxlength: "A senha deve ter no máximo 12 caracteres",
        }, 
        placa: {
            required: "campo placa é obrigatório",
            minlength: "A senha deve ter ao menos 6 caracteres",
            maxlength: "A senha deve ter no máximo 12 caracteres",
        },  
        cor: {
            required: "campo cor é obrigatório",
            minlength: "A senha deve ter ao menos 6 caracteres",
            maxlength: "A senha deve ter no máximo 12 caracteres",
        },                                 
    }
  });