let cadastrar = document.getElementById("cadastrar");

function menu(){
    let menu = document.getElementById("menu-mobile");
    if(menu.style.display === 'block'){
        menu.style.display = 'none';
    }else{
        menu.style.display = 'block';
    }
}

/************************/
function alertCadastro(){
    alert("dados cadastrados com sucesso!");
}
cadastrar.addEventListener("click",alertCadastro);



/************/

