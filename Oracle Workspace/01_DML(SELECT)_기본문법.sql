-- DML : ������ ���� , SELECT(DQL) , INSERT , UPDATE , DELETE
-- DDL : ������ ���� , CREATE , ALETER , DROP
-- TCL : Ʈ����� ���� , COMMIT , ROLLBACK
-- DCL : ���Ѻο� , GRANT , REVOKE

/*
    <SELECT>
    �����͸� ��ȸ�ϰų� �˻��� �� ����ϴ� ��ɾ�
    - RESULT SET : SELECT ������ ���� ��ȸ�� �������� ������� �ǹ�
                    ��, ��ȸ�� ����� ����
                    
    [ǥ����]
    SELECT ��ȸ�ϰ��� �ϴ� �÷���, �÷���2, �÷���3, ...
    FROM ���̺��;

*/
-- EMPLOYEE ���̺��� ��ü ������� ���, �̸�, �޿� Į������ ��ȸ
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE;

-- EMPLYOEE ���̺��� ��ü ������� ��� Į���� ��ȸ.
SELECT *
FROM EMPLOYEE;

-- EMPLOYEE ���̺��� ��ü ������� �̸�, �̸���, �޴�����ȣ�� ��ȸ
SELECT EMP_NAME, EMAIL, PHONE
FROM EMPLOYEE;

----------------------- �ǽ����� -----------------------
--- 1�� . JOB ���̺��� ��� Į�� ��ȸ
SELECT *
FROM JOB;

--- 2�� . JOB ���̺��� ���޸� ��ȸ
SELECT JOB_NAME
FROM JOB;

--- 3�� . DEPARTMENT ���̺��� ��� Į�� ��ȸ
SELECT *
FROM DEPARTMENT;

--- 4�� . EMPLOYEE ���̺��� ������, �̸���, ��ȭ��ȣ, �Ի��� Į���� ��ȸ
SELECT EMP_NAME, EMAIL, PHONE, HIRE_DATE
FROM EMPLOYEE;

--- 5�� . EMPLOYEE ���̺��� �Ի���, ������, �޿�Į���� ��ȸ
SELECT HIRE_DATE, EMP_NAME, SALARY
FROM EMPLOYEE;

/*
    <�÷����� ���� �������>
    ��ȸ�ϰ��� �ϴ� Į������ �����ϴ� SELECT������ �������(+-/*)�� ����ؼ� ����� ��ȸ�Ҽ� �ִ�.
*/

-- EMPLOYEE ���̺�κ��� �������, ����, ����
SELECT EMP_NAME, SALARY, SALARY * 12 
FROM EMPLOYEE;

-- EMPLOYEE ���̺�κ��� ������� ���� ���ʽ�, ���ʽ��� ���Ե� ����(SALARY + SALARY * BONUS)*12.
SELECT EMP_NAME, SALARY,  BONUS, (SALARY + SALARY * BONUS) * 12
FROM EMPLOYEE;
--> ������� �������� NULL���� ������ ��� ������� ��������� NULL�� �ȴ�.

-- EMPLOYEE ���̺�κ��� ������, �Ի���, �ٹ��ϼ� ��ȸ(���ó�¥ - �Ի���)
-- DATE Ÿ�Գ����� ������ ���� (DATA => ��, ��, ��, ��, ��, ��)
-- ���ó�¥ : SYSDATE
SELECT EMP_NAME, HIRE_DATE, SYSDATE - HIRE_DATE, SYSDATE
FROM EMPLOYEE;
-- ������� �������� ���� : DATEŸ�� �ȿ� ���Ե� ��, ��, �� ������ ������� �����ϱ⶧��.
-- ������� �ϼ� ������ ���.

/*
    <�÷��� ��Ī �ο��ϱ�>
    [ǥ����]
    �÷��� AS ��Ī, �÷��� AS *��Ī*, �÷��� ��Ī, �÷��� *��Ī*
    
    AS�� Ű���� ���̵� �Ⱥ��̵� ����
    ��Ī�� Ư�����ڳ� ���Ⱑ ���Ե� ��� **�� ��� ǥ���������.
*/

-- EMPLOYEE ���̺�κ��� �������, ����, ����
SELECT EMP_NAME, SALARY AS "�޿�(��)", SALARY * 12 AS "����(���ʽ� ������)"
FROM EMPLOYEE;

-- EMPLOYEE ���̺�κ��� ������, �Ի���, �ٹ��ϼ� ��ȸ(���ó�¥ - �Ի���)
-- DATE Ÿ�Գ����� ������ ���� (DATA => ��, ��, ��, ��, ��, ��)
-- ���ó�¥ : SYSDATE
SELECT EMP_NAME AS "�����", HIRE_DATE AS "�Ի���", SYSDATE - HIRE_DATE AS "�ٹ��ϼ�"
FROM EMPLOYEE;


/*
    < ���ͷ� >
    ���Ƿ� ������ ���ڿ�('')�� SELECT���� ����ϸ�
    ���� �� ���̺� �����ϴ� ������ó�� ��ȸ�� �����ϴ�.
*/

-- EMPLOYEE ���̺�κ��� ���, �����, �޿�, ����('��') ��ȸ�ϱ�
SELECT EMP_ID, EMP_NAME, SALARY, '��' ����
FROM EMPLOYEE;

/*
    <DISTINCT>
    ��ȸ�ϰ��� �ϴ� Į���� �ߺ��� ���� �� �ѹ��� ��ȸ�ϰ��� �� �� ���
    
    [ǥ����]
    DISTINCT �÷Ÿ�
    (��, SELECT ���� DISTINCT ������ �� �Ѱ��� �����ϴ�.)
*/
-- EMPLOYEE ���̺��� �μ��ڵ�鸸 ��ȸ.
SELECT DISTINCT DEPT_CODE
FROM EMPLOYEE;

-- DEPT_CODE�� JOB_CODE ���� ��Ʈ�� ��� �ߺ� �Ǻ�.
SELECT DISTINCT DEPT_CODE, JOB_CODE
FROM EMPLOYEE;

----------------------------------------------------------------------------
/*
    <WHERE ��>
    ��ȸ�ϰ��� �ϴ� ���̺� Ư�� ������ �����ؼ�
    �� ���ǿ� �����ϴ� �����͵鸸�� ��ȸ�ϰ��� �� �� ����ϴ� ����
    
    [ǥ����]
    SELECT ��ȸ�ϰ����ϴ� �÷���, ...
    FROM ���̺��
    WHERE ���ǽ�; ==> ���ǿ� �ش��ϴ� ����� �̾Ƴ��ڴ�.
    
    �������
    FROM, WHERE, SELECT
    
    - ���ǽĿ� �پ��� �����ڵ� ��� ����
    
    <�񱳿�����>
    > , < , >= , <=
    = <��ġ�ϴ��� ����, �ڹٿ����� == ����)
    != , ^= , <> ��ġ���� �ʴ°�.
*/

