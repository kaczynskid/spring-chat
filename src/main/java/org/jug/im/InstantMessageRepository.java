package org.jug.im;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstantMessageRepository extends PagingAndSortingRepository<InstantMessage, Long> {
}
