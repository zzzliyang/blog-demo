package io.zzzliyang.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Liyang, Zhang on 3/18/2017.
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
