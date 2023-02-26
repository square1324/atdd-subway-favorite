package nextstep.subway.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findByMemberId(Long memberId);

    void deleteByIdAndMemberId(Long id, Long memberId);
}
