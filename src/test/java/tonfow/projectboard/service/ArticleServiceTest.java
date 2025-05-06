package tonfow.projectboard.service;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import tonfow.projectboard.domain.Article;
import tonfow.projectboard.domain.type.SearchType;
import tonfow.projectboard.dto.ArticleDto;
import tonfow.projectboard.dto.ArticleUpdateDto;
import tonfow.projectboard.repository.ArticleRepository;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;
import static org.mockito.BDDMockito.given;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;

    @Mock private ArticleRepository articleRepository;

    @DisplayName("게시글을 검색하면, 게시글 리스트 반환.")
    @Test
    void articlesList() {
        //given

        //when
        Page<ArticleDto> articles =  sut.searchArticles(SearchType.TITLE, "search keyword");

        //then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글 조회시, 게시글 반환.")
    @Test
    void articleById() {
        //given

        //when
        ArticleDto articles =  sut.searchArticles(1L);

        //then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글 정보 입력하면, 게시글 생성")
    @Test
    void saveArticle() {
        //given
        ArticleDto dto = ArticleDto.of(LocalDateTime.now(), "juhan", "testTitle1", "testContent", "#Spring");
        given(articleRepository.save(any(Article.class))).willReturn(null);

        //when
        sut.saveArticle(dto);

        //then
        then(articleRepository).should().save(any(Article.class));
    }

    @DisplayName("게시글의 ID와 수정 정보 입력하면, 게시글 수정")
    @Test
    void updateArticle() {
        //given
        ArticleUpdateDto dto = ArticleUpdateDto.of( "testTitle1", "testContent", "#Spring");
        given(articleRepository.save(any(Article.class))).willReturn(null);

        //when
        sut.updateArticle(1L,dto);

        //then
        then(articleRepository).should().save(any(Article.class));
    }

    @DisplayName("게시글의 ID로, 게시글 삭제")
    @Test
    void deleteArticle() {
        //given
        willDoNothing().given(articleRepository).delete(any(Article.class));

        //when
        sut.deleteArticle(1L);

        //then
        then(articleRepository).should().delete(any(Article.class));
    }
}