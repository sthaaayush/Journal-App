//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController // Marks this class as a REST controller where methods return data directly (usually as JSON).
//@RequestMapping("/journal") // Base URL path for all endpoints in this controller.
//public class JournalEntryController {
//
//    // In-memory storage for journal entries (simulating a database)
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping // Handles GET requests to "/journal"
//    public List<JournalEntry> getAll() {
//        // Returns a list of all journal entries
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping // Handles POST requests to "/journal"
//    public boolean createEntry(@RequestBody JournalEntry myEntries) {
//        // Adds a new journal entry to the map using its ID
//        journalEntries.put(myEntries.getId(), myEntries);
//        return true;
//    }
//
//    @GetMapping("/id/{myId}") // Handles GET requests to "/journal/id/{myId}"
//    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
//        // Retrieves a journal entry by its ID
//        return journalEntries.get(myId);
//    }
//
//    @DeleteMapping("/id/{myId}") // Handles DELETE requests to "/journal/id/{myId}"
//    public JournalEntry removeJournalEntryById(@PathVariable Long myId) {
//        // Removes and returns the journal entry with the specified ID
//        return journalEntries.remove(myId);
//    }
//
//    @PutMapping("/id/{myId}") // Handles PUT requests to "/journal/id/{myId}"
//    public JournalEntry updateJournalEntryById(@PathVariable Long myId, @RequestBody JournalEntry myEntries) {
//        // Updates the journal entry with the specified ID and returns the updated entry
//        return journalEntries.put(myId, myEntries);
//    }
//}
