package pl.moviereviews.domain.movie;

import pl.moviereviews.domain.movie.dto.MovieDto;

class MovieDtoMapper {
    static MovieDto map(Movie movie) {
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getOriginalTitle(),
                movie.getReleaseYear(),
                movie.getGenre().getName(),
                movie.isPromoted()
        );
    }
}
