package tonfow.projectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tonfow.projectboard.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}