package org.jug.im;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface InstantMessageRepository extends PagingAndSortingRepository<InstantMessage, Long> {
}
