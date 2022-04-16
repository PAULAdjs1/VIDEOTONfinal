package org.factoriaf5.filmcity.repositories;

import org.factoriaf5.filmcity.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private final MovieRepository movieRepository;

    @Autowired
    public SampleDataLoader(MovieRepository movieRepository){

        this.movieRepository = movieRepository;
    }

    @PostConstruct
    public void addSampleMovies() {
        if (movieRepository.findAll().isEmpty()) {
            List<Movie> movies = List.of(
                    new Movie("Jurassic Park",
                            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oU7Oq2kFAAlGqbU4VoAE36g4hoI.jpg",
                            "Steven Spielberg",
                            1993,
                            "A wealthy entrepreneur secretly creates a theme park featuring living dinosaurs drawn from prehistoric DNA.",
                            true,
                            "Paula",
                            5),

            new Movie("Los Goonies",
                            "https://pics.filmaffinity.com/the_goonies-301424062-mmed.jpg",
                            "Richard Donner",
                            1985,
                            "Mikey es un niño de trece años que junto con su hermano mayor y sus amigos forman un grupo que se hacen llamar \"los Goonies\". Un día deciden subir al desván de su casa, donde su padre guarda antigüedades. Allí encuentran el mapa de un tesoro perdido que data del siglo XVII, de la época de los piratas, y deciden salir a buscarlo repletos de espíritu aventurero.",
                             false,
                             null,
                             4),

            new Movie("Regreso al futuro 1",
                            "https://pics.filmaffinity.com/back_to_the_future-100822308-mmed.jpg",
                            "Robert Zemeckis",
                            1985,
                            "El adolescente Marty McFly es amigo de Doc, un científico al que todos toman por loco. Cuando Doc crea una máquina para viajar en el tiempo, un error fortuito hace que Marty llegue a 1955, año en el que sus futuros padres aún no se habían conocido. Después de impedir su primer encuentro, deberá conseguir que se conozcan y se casen; de lo contrario, su existencia no sería posible.",
                            true,
                            "Paula",
                            5),
                    new Movie("Indiana Jones y la última cruzada",
                            "https://pics.filmaffinity.com/indiana_jones_and_the_last_crusade-834556032-mmed.jpg",
                            "Steven Spielberg",
                            1989,
                            "En esta tercera entrega, el padre del protagonista (Harrison Ford), Henry Jones, también arqueólogo (Sean Connery), es secuestrado cuando buscaba el Santo Grial. Indiana tendrá que ir a rescatarlo y, de paso, intentar hacerse con la preciada reliquia, que también ambicionan los nazis.",
                            false,
                            null,
                            5),
                    new Movie("Agarralo como puedas",
                            "https://pics.filmaffinity.com/the_naked_gun-666742902-mmed.jpg",
                            "David Zucker",
                            1988,
                            "Tras quedar gravemente herido su compañero Nordberg en un tiroteo protagonizado por una banda de narcotraficantes, el incompetente teniente Frank Drebin busca al jefe de la organización para vengarse. Sospecha del magnate naviero Vincent Ludwig, pero no tiene pruebas para inculparlo. Sin embargo, de manera inesperada, consigue la ayuda de Jane Spencer, una antigua novia de Ludwig.",
                            true,
                            "Andrea",
                            4),
                    new Movie("Indiana Jones y el arca perdida",
                            "https://pics.filmaffinity.com/indiana_jones_raiders_of_the_lost_ark-316486950-mmed.jpg",
                            "Steven Spielberg",
                            1981,
                            "Año 1936. Indiana Jones es un profesor de arqueología, dispuesto a correr peligrosas aventuras con tal de conseguir valiosas reliquias históricas. Después de una infructuosa misión en Sudamérica, el gobierno estadounidense le encarga la búsqueda del Arca de la Alianza, donde se conservan las Tablas de la Ley que Dios entregó a Moisés. Según la leyenda, quien las posea tendrá un poder absoluto, razón por la cual también la buscan los nazis.",
                            false,
                            null,
                            5),
                    new Movie("El club de los poetas muertos",
                            "https://pics.filmaffinity.com/dead_poets_society-458617909-mmed.jpg",
                            "Peter Weir",
                            1989,
                            "En un elitista y estricto colegio privado de Nueva Inglaterra, un grupo de alumnos descubrirá la poesía, el significado del \"carpe diem\" -aprovechar el momento- y la importancia vital de luchar por alcanzar los sueños, gracias al Sr. Keating, un excéntrico profesor que despierta sus mentes por medio de métodos poco convencionales.",
                            false,
                            null,
                            2)

            // Añadir aqui todas las pelis del catálogo!!
            );

            movieRepository.saveAll(movies);
        }
    }
}