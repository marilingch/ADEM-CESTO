SELECT DISTINCT l.file_seq, l.file_typ, l.file_ser, l.file_nbr, s.status_name, p.status_code, p.status_date, f.proc_nbr 
FROM cu.ip_mark_log_changes l 
INNER JOIN cu.ip_file f ON l.file_seq = f.file_seq 
 AND l.file_typ = f.file_typ 
 AND l.file_ser = f.file_ser 
 AND l.file_nbr = f.file_nbr 
 AND l.change_date >=  getdate() - 202
INNER JOIN cu.ip_proc p ON f.proc_nbr = p.proc_nbr 
INNER JOIN cu.cf_status s ON p.status_code = s.status_code 
 AND s.PROC_TYP = p.proc_typ 
 AND p.status_code not in ('146', '178', '180', '191')  
ORDER BY l.file_nbr