package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.services.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryContollerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.findAllEntry();
    }

    @PostMapping
    public void createEntry(@RequestBody JournalEntry myEntries) {
        journalEntryService.saveEntry(myEntries);
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable String myId) {
        return journalEntryService.findEntryById(myId);
    }

    @DeleteMapping("/id/{myId}")
    public void removeJournalEntryById(@PathVariable String myId) {
        journalEntryService.deleteEntryById(myId);
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournalEntryById(@PathVariable String myId, @RequestBody JournalEntry myEntries) {
        journalEntryService.updateEntryById(myId, myEntries);
        return journalEntryService.findEntryById(myId);
    }
}
