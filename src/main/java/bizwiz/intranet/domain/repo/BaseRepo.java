package bizwiz.intranet.domain.repo;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class BaseRepo {
    protected final JPAQueryFactory jpaQueryFactory;
}
