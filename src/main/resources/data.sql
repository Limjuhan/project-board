insert into article (created_at, modified_at, created_by, modified_by, content, title)
values
    (now(), now(), 'juhan1', 'juhan1', '내용1입니다.', '주제1'),
    (now(), now(), 'juhan2', 'juhan2', '내용2입니다.', '주제2'),
    (now(), now(), 'juhan3', 'juhan3', '내용3입니다.', '주제3'),
    (now(), now(), 'juhan4', 'juhan4', '내용4입니다.', '주제4'),
    (now(), now(), 'juhan5', 'juhan5', '내용5입니다.', '주제5'),
    (now(), now(), 'juhan6', 'juhan6', '내용6입니다.', '주제6'),
    (now(), now(), 'juhan7', 'juhan7', '내용7입니다.', '주제7'),
    (now(), now(), 'juhan8', 'juhan8', '내용8입니다.', '주제8'),
    (now(), now(), 'juhan9', 'juhan9', '내용9입니다.', '주제9'),
    (now(), now(), 'juhan10', 'juhan10', '내용10입니다.', '주제10');

INSERT INTO article_comment (article_id, created_at, modified_at, created_by, modified_by, content)
VALUES
    (1, NOW(), NOW(), 'user1', 'user1', '댓글 내용 1'),
    (1, NOW(), NOW(), 'user2', 'user2', '댓글 내용 2'),
    (2, NOW(), NOW(), 'user3', 'user3', '댓글 내용 3'),
    (2, NOW(), NOW(), 'user4', 'user4', '댓글 내용 4'),
    (3, NOW(), NOW(), 'user5', 'user5', '댓글 내용 5'),
    (3, NOW(), NOW(), 'user6', 'user6', '댓글 내용 6'),
    (4, NOW(), NOW(), 'user7', 'user7', '댓글 내용 7'),
    (4, NOW(), NOW(), 'user8', 'user8', '댓글 내용 8'),
    (5, NOW(), NOW(), 'user9', 'user9', '댓글 내용 9'),
    (5, NOW(), NOW(), 'user10', 'user10', '댓글 내용 10');