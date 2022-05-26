INSERT INTO public.student(student_id,first_name, last_name)
VALUES 
(1,'Leonardo', 'Silva dos Pereira') 
ON CONFLICT (student_id) DO NOTHING;
