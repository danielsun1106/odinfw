INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('dan2', 'Daniel', '******');
INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('pau2', 'Paul', '******');
INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('joh3', 'John', '******');
INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('ali3', 'Alice', '******');
INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('pet2', 'Peter', '******');
INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('joc5', 'Jochen', '******');
INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('gra5', 'Grace', '******');
INSERT INTO USER_DAT (ID, NAME, PASSWORD) VALUES ('sam6', 'Sam', '******');

INSERT INTO FW_MENU(ID , TEXT, LEAF, PARENT_ID, FORM_NAME) VALUES ('2', 'System Administration', '0', '0', NULL);
INSERT INTO FW_MENU(ID , TEXT, LEAF, PARENT_ID, FORM_NAME) VALUES ('3', 'Development Utilities', '0', '0', NULL);
INSERT INTO FW_MENU(ID , TEXT, LEAF, PARENT_ID, FORM_NAME) VALUES ('21', 'Manage Users', '1', '2', 'UserQueryForm');
INSERT INTO FW_MENU(ID , TEXT, LEAF, PARENT_ID, FORM_NAME) VALUES ('22', 'Manage Roles', '1', '2', 'TodoForm');
INSERT INTO FW_MENU(ID , TEXT, LEAF, PARENT_ID, FORM_NAME) VALUES ('31', 'H2 Console', '1', '3', 'H2ConsoleForm');
INSERT INTO FW_MENU(ID , TEXT, LEAF, PARENT_ID, FORM_NAME) VALUES ('32', 'Druid Monitor', '1', '3', 'DruidMonitorForm');
INSERT INTO FW_MENU(ID , TEXT, LEAF, PARENT_ID, FORM_NAME) VALUES ('33', 'MyBatis Generator', '1', '3', 'MyBatisGeneratorForm');

COMMIT;
