INSERT INTO ROLES (name) VALUES ('Admin'),('User'), ('Supervisor');

INSERT INTO STATUSES (name) VALUES ('Pending'), ('Approved'), ('Rejected'), ('Completed');

INSERT INTO USERS (name, email, password, role_id) VALUES ('John Doe', 'johndoe@example.com', 'password123', 1), ('Jane Smith', 'janesmith@example.com', 'password456', 2),('Michael Johnson', 'michaeljohnson@example.com', 'password789', 3);

INSERT INTO PROJECTS (student_id, supervisor_id, title, proposal_link, github_link, webpage_link, literature_review_link, srs_link, sdd_link, report_link, date_proposed, academic_year, status_id, grade) VALUES (1, 3, 'Project 1', 'https://example.com/proposal1', 'https://github.com/project1', 'https://example.com/project1', 'https://example.com/literature1', 'https://example.com/srs1', 'https://example.com/sdd1', 'https://example.com/report1', '2022-01-01', '2022', 2, 4.5), (2, 3, 'Project 2', 'https://example.com/proposal2', 'https://github.com/project2', 'https://example.com/project2', 'https://example.com/literature2', 'https://example.com/srs2', 'https://example.com/sdd2', 'https://example.com/report2', '2022-02-01', '2022', 1, 3.8), (3, 2, 'Project 3', 'https://example.com/proposal3', 'https://github.com/project3', 'https://example.com/project3', 'https://example.com/literature3', 'https://example.com/srs3', 'https://example.com/sdd3', 'https://example.com/report3', '2022-03-01', '2022', 3, 2.7);

INSERT INTO FEEDBACKS (user_id, project_id, feedback, date_given) VALUES (1, 1, 'Great work!', '2022-02-15'), (2, 1, 'Needs improvement in documentation.', '2022-02-20'), (3, 2, 'Well done!', '2022-03-05');

INSERT INTO RESOURCES (name, link) VALUES ('Resource 1', 'https://example.com/resource1'),('Resource 2', 'https://example.com/resource2'),('Resource 3', 'https://example.com/resource3');