SELECT f.file_seq, f.file_typ, f.file_ser, f.file_nbr, s.status_name, s.status_code, p.status_date, f.proc_nbr
FROM cf_status s, ip_proc p, ip_file f, ip_mark m, cf_process_result_type c
WHERE
 s.status_code = p.status_code
 AND f.file_seq = p.file_seq
 AND f.file_typ = p.file_typ
 AND f.file_ser = p.file_ser
 AND f.file_nbr = p.file_nbr
 AND f.file_seq = m.file_seq
 AND f.file_typ = m.file_typ
 AND f.file_ser = m.file_ser
 AND f.file_nbr = m.file_nbr
 AND f.proc_typ = p.proc_typ
 AND s.proc_typ = p.proc_typ
 AND p.proc_nbr = f.proc_nbr
 AND c.process_result_typ = s.process_result_typ
 AND f.capture_date >= GETDATE() - 202
 AND f.file_ser = YEAR(GETDATE())
 AND s.status_code not in ('146', '178', '180', '191')  
ORDER BY
  f.file_ser, f.file_nbr 