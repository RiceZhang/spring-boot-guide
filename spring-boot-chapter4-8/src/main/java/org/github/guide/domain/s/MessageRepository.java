package org.github.guide.domain.s;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by R on 2016/12/5.
 */
public interface MessageRepository extends JpaRepository<Message, Long> {

}
