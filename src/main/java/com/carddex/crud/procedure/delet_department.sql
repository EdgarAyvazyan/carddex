CREATE OR REPLACE PROCEDURE cdx_cims.delete_departments(departmentUuid uuid)

    language plpgsql
as
$$
BEGIN
    update departments_user_v
    set deleted= 1
    where department_uuid = '@departmentUuid';

    COMMIT;

END
$$;
