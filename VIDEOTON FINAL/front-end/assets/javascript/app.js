
printMoviesList();

function printMoviesList () {
    fetch("http://localhost:8080/movies")
    .then((respuesta)=> { //parsear la respuesta
        return respuesta.json();
    })
    .then((moviesData)=> {

    //Donde quiero imprimir los titulos en el html
    let moviesListElement = document.getElementById('movies');

        for(let i = 0; i<= moviesData.length; i++){

          if(moviesData[i].book == true){

            let nuevoElementoHTML = `      
            <div class="col">
            <div class="example-1 card">
            <div class="dispo">
              <span class="disponible">Disponible: ${moviesData[i].book}</span>
            </div>
          </div>
          <img class="coverImage" src="${moviesData[i].coverImage}"/>
          <a href="indexfichapelicula.html">
            <p class="paragraph-title">${moviesData[i].title}</p>
          </a>
        </div>
          `
           moviesListElement.innerHTML+= nuevoElementoHTML;
          }else{
            let nuevoElementoHTML = `      
            <div class="col">
            <div class="example-1 card">
            <div class="dispo">
              <span class="rented">Disponible: ${moviesData[i].book}</span>
            </div>
          </div>
          <img class="coverImage" src="${moviesData[i].coverImage}"/>
          <a href="indexfichapelicula.html">
            <p class="paragraph-title">${moviesData[i].title}</p>
          </a>
        </div>
          `
           moviesListElement.innerHTML+= nuevoElementoHTML;
          }
        };
      })
        }