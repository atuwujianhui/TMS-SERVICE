INSERT INTO tms_interface_case(id, code, content_type, expected_response_content, expected_response_type, function_id, interface_type, is_ajax, iteration_id, method, module_id, name, precondition, remarks, state, update_cookie, uri, system_id, parameter, parameter_source) VALUES (1, '1', 0, '{\r\n	\"code\": 0,\r\n	\"msg\": \"这是一个无参数的Get请求！\"\r\n}', 1, NULL, 0, 0, 1, 0, NULL, '无参数的Get请求测试', NULL, NULL, 1, 0, '/getDemo', 1, NULL, NULL);
INSERT INTO tms_interface_case(id, code, content_type, expected_response_content, expected_response_type, function_id, interface_type, is_ajax, iteration_id, method, module_id, name, precondition, remarks, state, update_cookie, uri, system_id, parameter, parameter_source) VALUES (2, '2', 0, '这是一个带参数的Get请求！', 0, NULL, 0, 0, 1, 0, NULL, '带参数的Get请求测试', NULL, NULL, 1, 0, '/getWithParameter', 1, '{\r\n  \"name\": \"Atu\",\r\n  \"age\": \"24\"\r\n}', NULL);
INSERT INTO tms_interface_case(id, code, content_type, expected_response_content, expected_response_type, function_id, interface_type, is_ajax, iteration_id, method, module_id, name, precondition, remarks, state, update_cookie, uri, system_id, parameter, parameter_source) VALUES (3, '3', 0, '这是一个无参数的Post请求！', 0, NULL, 0, 0, 1, 1, NULL, '无参数的Post请求测试', NULL, NULL, 1, 0, '/postDemo', 1, NULL, NULL);
INSERT INTO tms_interface_case(id, code, content_type, expected_response_content, expected_response_type, function_id, interface_type, is_ajax, iteration_id, method, module_id, name, precondition, remarks, state, update_cookie, uri, system_id, parameter, parameter_source) VALUES (4, '4', 0, '{\r\n	\"code\": 0,\r\n	\"msg\": \"模拟一个带表单参数的Post请求！\"\r\n}', 1, NULL, 0, 0, 1, 1, NULL, '带Form参数的Post请求测试', NULL, NULL, 1, 0, '/postWithParameter', 1, '{\r\n  \"name\": \"Atu\",\r\n  \"age\": \"24\"\r\n}', NULL);
INSERT INTO tms_interface_case(id, code, content_type, expected_response_content, expected_response_type, function_id, interface_type, is_ajax, iteration_id, method, module_id, name, precondition, remarks, state, update_cookie, uri, system_id, parameter, parameter_source) VALUES (5, '5', 1, '{\r\n  \"code\": 0,\r\n  \"msg\": \"模拟一个带JSON参数的Post请求！\"\r\n}', 1, NULL, 0, 0, 1, 1, NULL, '带JSON参数的Post请求', NULL, NULL, 1, 0, '/postWithJSONParameter', 1, '{\r\n  \"name\": \"Atu\",\r\n  \"age\": \"24\"\r\n}', NULL);
