package com.springMVC.Employee;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")

public class EmployeeController {
	EmployeeService empService = new EmployeeService();
	@RequestMapping(value = "/Emp-list",method = RequestMethod.GET)
	public String ShowEmpList(ModelMap map ,String name)
	{
		map.addAttribute("name", (String) map.get("name"));
		map.addAttribute("EmpList",empService.retrieveEmp());
		return "EmployeeList";
		
	}
	
	@RequestMapping(value = "/DelEmp-list",method = RequestMethod.GET)
	public String DelEmpList(ModelMap map ,@RequestParam int id)
	{
		empService.deleteEmpList(id);
		return "redirect:/Emp-list";		
	}
	
	@RequestMapping(value = "/AddEmp-list",method = RequestMethod.GET)
	public String AddEmpList(ModelMap map)
	{
		map.addAttribute("employees", new Employees());
		return "AddEmpList";
	}
	
	@RequestMapping(value = "/AddEmp-list",method = RequestMethod.POST)
	public String GetEmpList(ModelMap map ,Employees employees)
	{
		empService.addEmpList(employees.getName(), employees.getRole(), employees.getProject());
		return "redirect:/Emp-list";
	}
	
	@RequestMapping(value = "/UpdEmp-list",method = RequestMethod.GET)
	public String GetModifyEmpList(ModelMap map ,@RequestParam int id)
	{
		map.addAttribute("employees",empService.GetEmpList(id));
		return "AddEmpList";
	}
	
	@RequestMapping(value = "/UpdEmp-list",method = RequestMethod.POST)
	public String ModifyEmpList(ModelMap map ,Employees employees)
	{
		empService.UpdateEmployees(employees);
		return "redirect:/Emp-list";
	}

}
