package com.github.wilyJ80.contact;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;

@Controller
public final class ContactController {

	private ContactDao contactDao;

	public ContactController(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@GetMapping("/")
	public String getIndexForm(Model model) {
		model.addAttribute("contact", new Contact());
		return "index";
	}

	@PostMapping("/")
	public String postMethodName(@ModelAttribute @Valid Contact contact, BindingResult bindingResult,
			RedirectAttributes attributes,
			Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("contact", contact);
			return "index";
		}

		this.contactDao.addContact(contact);
		attributes.addFlashAttribute("message", "Contato adicionado!");
		return "redirect:/success";
	}

	@GetMapping("/success")
	public String getSuccessPage() {
		return "success";
	}

	@GetMapping("/confirm")
	public String getConfirmPage(@ModelAttribute ContactWithDemographics contact, RedirectAttributes attributes,
			Model model) {

		List<ContactWithDemographics> contacts = this.contactDao.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "confirm";
	}
}
