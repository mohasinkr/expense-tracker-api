package com.mkr.expensetracker.service;

import com.mkr.expensetracker.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense createExpense(Expense expense);
    Expense updateExpense(Expense expense, Long id);
    void deleteExpense(Long id);
    List<Expense> getAllExpenses();
    Expense getExpenseById(Long id);
    List<Expense> searchExpenses(String keyword);
}
