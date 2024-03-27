SELECT f.file_seq, f.file_typ, f.file_ser, f.file_nbr, s.status_name, s.status_code, p.status_date, f.proc_nbr
FROM CF_STATUS S, IP_PROC P, IP_FILE F, CF_PROCESS_RESULT_TYPE C 
WHERE S.STATUS_CODE = P.STATUS_CODE 
 AND p.status_date >= GETDATE() - 202
 AND P.PROC_NBR = F.PROC_NBR 
 AND C.PROCESS_RESULT_TYP = S.PROCESS_RESULT_TYP  
 AND s.status_code not in ('146', '178', '180', '191')  
order by f.file_ser, f.file_nbr