INSERT INTO EXAM_HIST_MASTER (OPER_TYPE, LEVEL, NAME, EXAM_COUNT, SCORE, TEST_TIME, CREATE_DATETIME, UPDATE_DATETIME)
VALUES ('ADD', 1, '홍길동', 1, 100, 100, SYSDATE, SYSDATE);

INSERT INTO EXAM_HIST_DETAIL(QUESTION, ANSWER, RESULT, EXAM_HIST_MASTER_ID, CREATE_DATETIME, UPDATE_DATETIME)
VALUES ('2 + 1', '3', 'Y', 1, SYSDATE, SYSDATE);