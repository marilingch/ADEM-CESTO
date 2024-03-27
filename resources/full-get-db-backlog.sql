SELECT f.file_seq, f.file_typ, f.file_ser, f.file_nbr, s.status_name, s.status_code, p.status_date, f.proc_nbr 
FROM CF_STATUS S, IP_PROC P, IP_FILE F, IP_MARK M, CF_PROCESS_RESULT_TYPE C 
WHERE 
S.STATUS_CODE=P.STATUS_CODE  AND 
F.FILE_SER = P.FILE_SER AND 
F.FILE_NBR = P.FILE_NBR AND 
F.FILE_SEQ = P.FILE_SEQ AND 
F.FILE_TYP = P.FILE_TYP AND 
		
F.FILE_SER = M.FILE_SER AND 
F.FILE_NBR = M.FILE_NBR AND 
F.FILE_SEQ = M.FILE_SEQ AND 
F.FILE_TYP = M.FILE_TYP AND 
		
F.PROC_TYP = P.PROC_TYP AND 
S.PROC_TYP = P.PROC_TYP AND
P.PROC_NBR = F.PROC_NBR  AND
C.PROCESS_RESULT_TYP = S.PROCESS_RESULT_TYP AND
s.status_code not in ('146', '178', '180', '191') 
and f.file_ser=1 and f.file_typ='A' and  year(f.filing_date) between 2022 and 2023
order by f.file_ser, f.file_nbr
