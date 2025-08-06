package net.engineeringdigest.journalApp.services;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry myEntries) {
        journalEntryRepository.save(myEntries);
    }

    public List<JournalEntry> findAllEntry() {
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findEntryById(String myId) {
            return journalEntryRepository.findById(myId);
    }

    public void deleteEntryById(String myId) {
        journalEntryRepository.deleteById(myId);
    }

    public void updateEntryById(String myId, JournalEntry myEntries) {
        if (journalEntryRepository.findById(myId).isPresent()) {
            JournalEntry entry = journalEntryRepository.findById(myId).get();
            entry.setTitle(myEntries.getTitle());
            entry.setContent(myEntries.getContent());
            journalEntryRepository.save(entry);
        }
    }
}
