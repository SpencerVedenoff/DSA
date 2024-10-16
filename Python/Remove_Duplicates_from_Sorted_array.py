class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0  # Edge case: empty array

        i = 0  # This pointer tracks the position of unique elements

    # Start the second pointer from the second element
        for j in range(1, len(nums)):
            if nums[j] != nums[i]:  # If a new unique element is found
                i += 1              # Move the unique pointer forward
                nums[i] = nums[j]    # Place the new unique element at the correct position

        return i + 1  # Length of the unique elements section