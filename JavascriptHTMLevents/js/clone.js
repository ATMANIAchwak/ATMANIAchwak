

function cloneFunction(id, id2, x)
{

    let myDiv = document.getElementById(id2);

    for (let i = 0; i < x; i++){  
        let divClone = myDiv.cloneNode(true);
        divClone.id = 'art2';
        document.getElementById(id).appendChild(divClone);
    }

}

function removeId(id)
{
    for (let i = 0; i < 5; i++){
    document.getElementById(id).remove();
    }
}