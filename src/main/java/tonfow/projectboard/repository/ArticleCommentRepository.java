package tonfow.projectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tonfow.projectboard.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
